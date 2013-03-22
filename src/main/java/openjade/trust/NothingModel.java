package openjade.trust;

import java.util.List;

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

	@Override
	public List<Pair> getPairs(String[] terms) {
		return null;
	}

}
