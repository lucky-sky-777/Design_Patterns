package baitap.behavioural_patterns.strategy;

// The shared interface for our family of algorithms
public interface EncryptionStrategy {
	String encrypt(String data);
}