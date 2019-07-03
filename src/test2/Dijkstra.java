package test2;

import java.util.PriorityQueue;

public class Dijkstra {

	// method for search minimal cost
	public int getShortestPathFromTo(City source, City target) {
		source.minCost = 0; // starting cost 0
		PriorityQueue<City> cityQueue = new PriorityQueue<City>(); // create object for queue all cities
		cityQueue.add(source); // add first city in queue

		// while city queue is not empty
		while (!cityQueue.isEmpty()) {
			City u = cityQueue.poll();

			// go all paths and check all cost
			for (Path e : u.adjacencies) {
				City v = e.target;
				int costCity = e.cost;
				int costThroughU = u.minCost + costCity;

				// if cost target city less then previous cost, remove previous city from queue
				// else target city add to queue
				if (costThroughU < v.minCost) {
					cityQueue.remove(v);

					v.minCost = costThroughU;
					v.previousCity = u;
					cityQueue.add(v);
				}
			}
		}

		return target.minCost; // return minimal cost to target city

	}

}