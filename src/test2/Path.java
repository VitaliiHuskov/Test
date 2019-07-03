package test2;

class Path {

	public City target; // target city
	public int cost; // the cost of the way

	// constructor
	public Path(City argTarget, int argWeight) {
		target = argTarget;
		cost = argWeight;
	}
	
}