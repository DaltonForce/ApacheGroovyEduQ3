
@Controller
@RequestMapping("/employers")
class EmployeeController {

    @Qualifier("employeeServiceImpl")
    @Autowired
    EmployeeService employeeService

    @RequestMapping("/")

    String listEmployers (Map<String, Object> map){
        map.employee = new Employee()
        map.employersList = employeeService.listEmployers()

        "employers"
    }

}