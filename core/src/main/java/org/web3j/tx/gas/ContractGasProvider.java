package org.web3j.tx.gas;

import org.web3j.protocol.core.methods.request.Transaction;

import java.math.BigInteger;
import java.util.function.Supplier;

public interface ContractGasProvider {
    BigInteger getGasPrice(String contractFunc, Supplier<Transaction> transaction);
    BigInteger getGasLimit(String contractFunc, Supplier<Transaction> transaction);
}
