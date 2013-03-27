package openjade.trust;

import java.util.ArrayList;
import java.util.List;

import openjade.ontology.Rating;
import jade.core.AID;


public class IndirectModel extends AbstractModel {

	private static final long serialVersionUID = 1L;
	
	private List<AID> pairs = new ArrayList<AID>();

	public String getName() {
		return "IndirectModel";
	}
	
	@Override
	public void setIteration(int _iteration) {
		super.setIteration(_iteration);
		if (iteration > 1 && iteration % 5 == 0){
			for(AID pair : pairs){
				
			}
		}
	}
	
	@Override
	public void addRating(Rating rating) {
		super.addRating(rating);
		addPair(rating.getServer());
	}
	
	private void addPair(AID pair) {
		if (!pairs.contains(pair)) {
			pairs.add(pair);
			log.debug("addPair: " + pair.toString());
		}
	}
}
