package fr.adaming.service;

import java.util.List;
import fr.adaming.model.Hopital;



public interface IHopitalService {
	public List<Hopital> getAllHopital();
	public int addHopital(Hopital hosp);
	public int updateHopital(long id);
	public int deleteHopital(long id);
	public Hopital findHopital (long id);
}
