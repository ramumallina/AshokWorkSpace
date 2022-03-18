package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repository.AddresRepository;
import in.ashokit.repository.EmpRepository;

@Service
public class EmployeeService {

	private EmpRepository empRepo;

	private AddresRepository addrRepo;

	@Autowired
	public EmployeeService(EmpRepository empRepo, AddresRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}

	@Transactional(rollbackFor = Exception.class)
	public void saveData() {

		Employee emp = new Employee();
		emp.setEmpId(205);
		emp.setEmpName("Ketan");
		emp.setEmpSal(25000.00);
		empRepo.save(emp);

		int i = 10 / 0;

		Address addr = new Address();
		addr.setAddrId(505);
		addr.setEmpId(205);
		addr.setCity("Pune");
		addr.setState("MH");
		addr.setCountry("India");
		addrRepo.save(addr);
	}

}
