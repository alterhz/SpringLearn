package spittr.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import spittr.Spitter;
import spittr.Spittle;
import spittr.data.SpittleRepository;

@Component
public class TestSpittleRepository implements SpittleRepository {

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i=0; i<count; ++i) {
			spittles.add(new Spittle("Spittle " + i, new Date()));
		}
		
		return spittles;
	}

	@Override
	public Spittle findOne(long spittleId) {
		return new Spittle("Spittle " + spittleId, new Date());
	}

	@Override
	public Spitter save(Spitter spitter) {
		return spitter;
	}

	@Override
	public Spitter findByUsername(String name) {
		Spitter saved = new Spitter(24L, name, "24hours", "jack", "Bauer");
		return saved;
	}

}
