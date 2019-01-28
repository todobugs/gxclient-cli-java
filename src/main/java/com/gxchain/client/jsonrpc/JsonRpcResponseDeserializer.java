package com.gxchain.client.jsonrpc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.gxchain.client.jsonrpc.domain.JsonRpcError;
import com.gxchain.client.jsonrpc.domain.JsonRpcResponse;

import java.io.IOException;

public class JsonRpcResponseDeserializer extends JsonDeserializer<JsonRpcResponse> {

	@Override
	public JsonRpcResponse deserialize(JsonParser parser, DeserializationContext context)throws IOException{
		RawJsonRpcResponse rawRpcResponse = parser.readValueAs(RawJsonRpcResponse.class);

		return rawRpcResponse.toJsonRpcResponse();
	}

	private static class RawJsonRpcResponse {

		public JsonNode result;
		public JsonRpcError error;
		public String id;
		public String jsonrpc;

		private JsonRpcResponse toJsonRpcResponse() {
			JsonRpcResponse rpcResponse = new JsonRpcResponse();
			rpcResponse.setResult(result.toString());
			rpcResponse.setError(error);
			rpcResponse.setId(id);
			rpcResponse.setJsonrpc(jsonrpc);
			return rpcResponse;
		} 
	}
}