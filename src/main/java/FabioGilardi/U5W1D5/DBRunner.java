package FabioGilardi.U5W1D5;

import FabioGilardi.U5W1D5.dao.BookingService;
import FabioGilardi.U5W1D5.dao.BuildingService;
import FabioGilardi.U5W1D5.dao.UserService;
import FabioGilardi.U5W1D5.dao.WorkStationService;
import FabioGilardi.U5W1D5.entities.WorkStation;
import FabioGilardi.U5W1D5.enums.WorkStationType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Autowired
    private BuildingService buildingService;
    @Autowired
    private WorkStationService workStationService;
    @Autowired
    private BookingService bookingService;

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BookingManagement.class);

////        SAVE USER ON DB
//        List<User> userList = (List<User>) ctx.getBean("users");
//        userList.forEach(user -> userService.save(user));
//
////        SAVE BUILDINGS ON DB
//        List<Building> buildingList = (List<Building>) ctx.getBean("buildings");
//        buildingList.forEach(building -> buildingService.save(building));
//
////        SAVE WORKSTATIONS ON DB
//        List<WorkStation> workStationList = (List<WorkStation>) ctx.getBean("workstations");
//        workStationList.forEach(workStation -> workStationService.save(workStation));

////        SAVE RANDOM BOOKING ON DB
//        for (int i = 0; i < 50; i++) {
//            Random random = new Random();
//            try {
//                bookingService.save(new Booking(LocalDate.of(2024, 4, random.nextInt(1, 31)), workStationService.findById(random.nextInt(1, 11)), userService.findById(random.nextInt(1, 6))));
//            } catch (RuntimeException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }

        //        QUERY UTENTE PER RICERCA WORKSTATION PER TIPO E CITTA'
        List<WorkStation> workStationFilteredList = userService.filterWorkStationByTypeAndCity(WorkStationType.PRIVATO, "Milano");

        if (!workStationFilteredList.isEmpty()) workStationFilteredList.forEach(System.out::println);
        else System.out.println("No Workstation has been found!");
    }
}
