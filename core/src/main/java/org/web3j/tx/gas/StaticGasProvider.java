package org.web3j.tx.gas;

import org.web3j.protocol.core.methods.request.Transaction;

import java.math.BigInteger;
import java.util.function.Supplier;

public class StaticGasProvider implements ContractGasProvider {
    private BigInteger gasPrice;
    private BigInteger gasLimit;

    public StaticGasProvider(BigInteger gasPrice, BigInteger gasLimit) {
        this.gasPrice = gasPrice;
        this.gasLimit = gasLimit;
    }

    @Override
    public BigInteger getGasPrice(String contractFunc, Supplier<Transaction> transaction) {
        return gasPrice;
    }

    @Override
    public BigInteger getGasLimit(String contractFunc, Supplier<Transaction> transaction) {
        return gasLimit;
    }

}
