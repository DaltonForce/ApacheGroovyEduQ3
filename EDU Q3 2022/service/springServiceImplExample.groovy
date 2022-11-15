
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Transactional
    public List<Employee> listEmployers() {
        CriteriaQuery<Employeen> c = em.getCriteriaBuilder().createQuery(Employee.class);
        c.from(Employee.class);
        return em.createQuery(c).getResultList();
    }

}