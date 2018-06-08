package com.ricardoespsanto.barry.core;

import java.time.Instant;
import java.util.List;

/**
 * Blockchain definition
 */
public class Blockchain {

	private List<Transaction> currentTransactions;
	private List<Block> chain;

	public Blockchain() {

		newBlock(1, 100);
	}

	public Block newBlock(int proof, String previousHash) {

		final Block newBlock = new Block(chain.size(), proof, previousHash, Instant.now());
		currentTransactions.clear();
		chain.add(newBlock);
		return newBlock;
	}

	public void newTransaction(Transaction transaction) {
		currentTransactions.add(transaction);
	}

	public Block getLastBlock() {
		return chain.get(chain.size() - 1);
	}
}
