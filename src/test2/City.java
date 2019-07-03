package test2;

class City implements Comparable<City> {

	public String name; // city name
	public Path[] adjacencies; // array of all adjacent cities
	public Integer minCost = Integer.MAX_VALUE; // minimal cost infinity
	public City previousCity; // previous city

	// constructor
	public City(String cityName) {
		name = cityName;
	}

	// override method to string
	@Override
	public String toString() {
		return name;
	}

	// implementation method compare to from interface Comparable
	public int compareTo(City other) {
		return Integer.compare(minCost, other.minCost);
	}

}