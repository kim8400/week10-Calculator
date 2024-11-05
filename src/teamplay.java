public class teamplay {
    public static void main(String[] args) {
        // 오토바이 객체 생성
        MotorCycle yamaha = new MotorCycle("yamaha", "YZF-R1M", "Black", "Gas", 20.0);  // 0.2 kWh/km
        MotorCycle honda = new MotorCycle("honda", "CBR1000RR", "Blue", "Gas", 22.0);  // 12 km/L
        MotorCycle dukati = new MotorCycle("dukati", "Ducati V21L", "Silver", "Electric", 10.0);  // 10 km/L

        // 주행 거리 설정 (단위: km)
        double distance = 100;  // 100km 주행했다고 가정

        // 연비 계산 및 결과 출력
        System.out.println("\n주행 거리: " + distance + "km");
        System.out.println(yamaha.model + "가 사용한 연료: " + yamaha.calculateFuelUsed(distance) + " L");
        System.out.println(honda.model + "가 사용한 연료: " + honda.calculateFuelUsed(distance) + " L");
        System.out.println(dukati.model + "가 사용한 연료: " + dukati.calculateFuelUsed(distance) + " kWh");
    }
}

class MotorCycle {

    String maker; //인스턴스변수
    String model;
    String color;
    String fuelType;
    double fuelEfficiency;
    boolean isEngineOn = false;  // 시동 상태 (기본값은 꺼짐)
    static int totalCars = 0; //클래스 변수

    // 생성자: 오토바이의 속성을 초기화
    MotorCycle(String maker, String model, String color, String fuelType, Double fuelEfficiency) {
        totalCars++;

        // 지역 변수: 생성자 내부에서만 사용되는 변수
        String message = maker + " 오토바이가 생성되었습니다.";  // 지역 변수
        System.out.println(message);  // 생성자 내부에서만 출력 가능

        this.maker = maker;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
    // 메서드: 주행 거리(distance)와 연비를 사용해 소모한 연료 계산
    double calculateFuelUsed(double distance) {
        if (fuelType.equals("Electric")) {
            // 전기오토바이: km당 kWh 사용량으로 계산
            return distance * fuelEfficiency;
        } else {
            // 내연기관오토바이: km를 km/L로 나눠 사용한 연료량 계산
            return distance / fuelEfficiency;
        }
    }
}