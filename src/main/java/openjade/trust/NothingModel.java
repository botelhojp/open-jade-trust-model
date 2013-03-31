package openjade.trust;

import jade.core.AID;

import java.util.List;

import openjade.core.OpenAgent;
import openjade.ontology.Rating;
import openjade.trust.model.Pair;

public class NothingModel implements TrustModel {

	private static final long serialVersionUID = 1L;

	public String getName() {
		return "NothingModel";
	}

	public void addRating(Rating rating) {
	}

	public void setIteration(int iteration) {
	}

	public List<Pair> getPairs(String[] terms) {
		return null;
	}

	public void setAgent(OpenAgent taskAgent) {
	}

	public List<Rating> getRatings(AID aid) {
		return null;
	}

}
