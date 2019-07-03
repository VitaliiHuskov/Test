package test2;

public class Main {

	// test main method for finding the minimum cost
	public static void main(String[] args) {

		// create all object the cities
		City gdanks = new City("gdanks");
		City bydgoszcz = new City("bydgoszcz");
		City torun = new City("torun");
		City warszawa = new City("warszawa");

		Dijkstra dijkstra = new Dijkstra(); // create object for Dijkstra

		// set the cost for all paths between all cities
		gdanks.adjacencies = new Path[] { new Path(bydgoszcz, 1), new Path(torun, 3) };
		bydgoszcz.adjacencies = new Path[] { new Path(gdanks, 1), new Path(torun, 1), new Path(warszawa, 4) };
		torun.adjacencies = new Path[] { new Path(gdanks, 3), new Path(bydgoszcz, 1), new Path(warszawa, 1) };
		warszawa.adjacencies = new Path[] { new Path(bydgoszcz, 4), new Path(torun, 1) };

		// output
		System.out.println(dijkstra.getShortestPathFromTo(gdanks, warszawa));
		System.out.println(dijkstra.getShortestPathFromTo(bydgoszcz, warszawa));

	}

}