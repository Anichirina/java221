public class BonusMilesService {
    public long calculate(int price) {
        int partTicket = 20;
        int miles = price / partTicket;
        return miles;
    }
}



