package fr.adaming.service;

import java.util.List;
import fr.adaming.model.Hopital;



public interface IHopitalService {
	public List<Hopital> getAllHopital();
	public Hopital addHopital(Hopital hosp);
	public int deleteHopital(long idH);
	public Hopital findHopital (long idH);
	public Hopital updateHopital(Hopital hopital);
}
