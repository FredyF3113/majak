package pe.edu.upc.serviceimpls;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import pe.edu.upc.daointerfaces.CMagnitudDao;
import pe.edu.upc.entities.Magnitud;
import pe.edu.upc.serviceinterfaces.CMagnitudService;

@Named
public class MagnitudServiceImpl implements CMagnitudService {
//inject para utilizar una variable
	@Inject
	private CMagnitudDao mDao;

	public void insert(Magnitud m) {

		mDao.insert(m);
	}

	public List<Magnitud> list() {
		// TODO Auto-generated method stub
		return mDao.list();
	}

	public void delete(int id) {
		mDao.delete(id);
	}

}
