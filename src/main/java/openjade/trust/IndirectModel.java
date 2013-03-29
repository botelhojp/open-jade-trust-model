package openjade.trust;

import jade.core.AID;
import jade.lang.acl.ACLMessage;

import java.util.ArrayList;
import java.util.List;

import openjade.ontology.OpenJadeOntology;
import openjade.ontology.Rating;
import openjade.ontology.SendRating;


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
				
//				ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
//				
//				SendRating sendRating = new SendRating();				
//				Rating rating = new Rating();
//				rating.setClient(pair);
//				rating.setIteration(_iteration);
//				rating.setServer(null);
//				rating.setTerm(null);
//				sendRating.setRating(rating);
//
//				
//				msg.setSender(this.myAgent.getAID());
//				msg.addReceiver(pair);
//				this.myAgent.fillContent(msg, sendRating, this.myAgent.getCodec(), OpenJadeOntology.getInstance());
//				this.myAgent.signerAndSend(msg);
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
