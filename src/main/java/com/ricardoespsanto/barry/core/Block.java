package com.ricardoespsanto.barry.core;

import java.time.Instant;
import java.util.List;

public class Block {

	private String previousHash;
	private int proof;
	private long index;
	private Instant timestamp;
	private List<Transaction> transactions;

	public Block(long index, int proof, String previousHash, Instant timestamp) {
		this.index = index;
		this.proof = proof;
		this.previousHash = previousHash;
		this.timestamp = timestamp;
	}

	public static void hash(Block block) {

	}
}