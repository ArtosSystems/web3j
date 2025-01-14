package org.web3j.protocol.eea;

import org.junit.Test;

import org.web3j.protocol.RequestTester;
import org.web3j.protocol.http.HttpService;


public class RequestTest extends RequestTester {
    private Eea web3j;

    @Override
    protected void initWeb3Client(HttpService httpService) {
        web3j = Eea.build(httpService);
    }

    @Test
    public void testEthSendRawTransaction() throws Exception {
        web3j.eeaSendRawTransaction(
                "0xd46e8dd67c5d32be8d46e8dd67c5d32be8058bb8eb970870f"
                        + "072445675058bb8eb970870f072445675").send();

        //CHECKSTYLE:OFF
        verifyResult("{\"jsonrpc\":\"2.0\",\"method\":\"eea_sendRawTransaction\",\"params\":[\"0xd46e8dd67c5d32be8d46e8dd67c5d32be8058bb8eb970870f072445675058bb8eb970870f072445675\"],\"id\":1}");
        //CHECKSTYLE:ON
    }

    @Test
    public void testEeaGetTransactionReceipt() throws Exception {
        web3j.eeaGetTransactionReceipt("0x123").send();

        verifyResult("{\"jsonrpc\":\"2.0\",\"method\":\"eea_getTransactionReceipt\","
                + "\"params\":[\"0x123\"],\"id\":1}");
    }

    @Test
    public void testEthGetTransactionCount() throws Exception {
        web3j.eeaGetTransactionCount("0x407d73d8a49eeb85d32cf465507dd71d507100c1",
                "0x0").send();

        verifyResult("{\"jsonrpc\":\"2.0\",\"method\":\"eea_getTransactionCount\","
                + "\"params\":[\"0x407d73d8a49eeb85d32cf465507dd71d507100c1\",\"0x0\"],"
                + "\"id\":1}");
    }

}
