package primerasclases;

public class Counter {
	int value;
	int maxValue;
	String model;
	
	public Counter(int maxValue, String model) {
		this.maxValue = maxValue > 10 ? maxValue : 10;
		this.model = model;
	}
	
	public Counter(int maxValue) {
		this(maxValue, "N-COUNTER");
	}
	
	public Counter() {
		this(100_000);
	}
	
	public Counter(Counter c) {
		this.value = c.value;
		this.model = c.model;
		this.maxValue = c.maxValue;
	}
	
	public void show() {
		System.out.printf("Contador: modelo (%s) y valor %d de %d.%n", this.model, this.value, this.maxValue);
	}
	
	public boolean increment() {
		return this.increment(1);
	}
	
	public boolean increment(int n) {
		boolean isIncrementable = this.value + n <= this.maxValue;
		this.value = isIncrementable ? this.value+=n : this.maxValue;
		return !isIncrementable;
	}
	
	public boolean reset() {
		boolean isReseteable = this.value == this.maxValue;
		if (isReseteable) {
			this.value = 0;
			return true;
		} else {
			return false;
		}
	}
}
