package core;

public enum Color {
	WHITE(5000), GOLDEN(10000), SILVER(6500), BLACK(8000), BROWN(15000);

	private int additionalCost;

	private Color(int additionalCost) {
		this.additionalCost = additionalCost;
	}

	@Override
	public String toString() {
		return name() + " with additional cost " + additionalCost;
	}

	public int getAdditonalCost() {
		return additionalCost;
	}
}
