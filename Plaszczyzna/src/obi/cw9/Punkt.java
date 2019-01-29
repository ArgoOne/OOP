package obi.cw9;

public class Punkt<T extends Number> {

	private T p1x;
	private T p1y;
	private T p2x;
	private T p2y;
	private double d;

	public Punkt(T p1x, T p1y, T p2x, T p2y) {
		this.p1x = p1x;
		this.p1y = p1y;
		this.p2x = p2x;
		this.p2y = p2y;
	}

	public T getP1x() {
		return p1x;
	}

	public T getP1y() {
		return p1y;
	}

	public T getP2x() {
		return p2x;
	}

	public T getP2y() {
		return p2y;
	}

	public Number getD() {
		return d;
	}

	public void liczenie() {

		d = Math.sqrt(Math.pow((p1x.doubleValue() - p2x.doubleValue()), 2)
				+ Math.pow((p1y.doubleValue() - p2y.doubleValue()), 2));
	}
}
