//package Excecoes;
//
//import main.java.Exception.DomainException;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.concurrent.TimeUnit;
//
//public class Reservation {
//
//    private Integer roomNumber;
//    private Date checkIn;
//    private Date checkOut;
//
//    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//
//        public Integer getRoomNumber () {
//            return roomNumber;
//        }
//
//        public void setRoomNumber (Integer roomNumber){
//            this.roomNumber = roomNumber;
//        }
//
//        public Date getCheckIn () {
//            return checkIn;
//        }
//
//        public void setCheckIn (Date checkIn){
//            this.checkIn = checkIn;
//        }
//
//        public Date getCheckOut () {
//            return checkOut;
//        }
//
//        public void setCheckOut (Date checkOut){
//            this.checkOut = checkOut;
//        }
//         public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
//             if(!checkOut.after(checkIn)) {
//                 throw new DomainException("Error in reservation: check-out date must be after  ");
//             }
//            this.roomNumber = roomNumber;
//            this.checkIn = checkIn;
//            this.checkOut = checkOut;
//    }
//    public long duration(){
//        long diff = checkOut.getTime() - checkIn.getTime();
//        return  TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
//    }
//    public void updateDates(Date checkIn, Date checkOut) throws DomainException{
//        Date now = new Date();
//        if(checkIn.before(now) || checkOut.before(now)){
//            throw new DomainException("Error in reservation: Check-out date must be after check-in date ");
//        }
//            this.checkIn = checkIn;
//        this.checkOut = checkOut;
//    }
//    public String toString(){
//        return "Room"
//           + roomNumber
//           + ",check-in: "
//           + sdf.format(checkIn)
//           +sdf.format(checkOut)
//           +  " , "
//           +duration()
//           + "nights";
//    }
//}
//
//
