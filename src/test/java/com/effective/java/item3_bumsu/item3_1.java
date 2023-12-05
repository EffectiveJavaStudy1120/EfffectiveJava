//public class Configuration {
//    private static Configuration instance;
//    private String configValue;
//
//    // Private 생성자
//    private Configuration() {
//        // 초기 구성 로드 또는 설정
//        configValue = "Default Config";
//    }
//
//    // 싱글톤 인스턴스를 반환하는 메서드
//    public static synchronized Configuration getInstance() {
//        if (instance == null) {
//            instance = new Configuration();
//        }
//        return instance;
//    }
//
//    // 설정 값을 가져오는 메서드
//    public String getConfigValue() {
//        return configValue;
//    }
//
//    // 설정 값을 변경하는 메서드
//    public void setConfigValue(String configValue) {
//        this.configValue = configValue;
//    }
//}
////사용
//public class Application {
//    public static void main(String[] args) {
//        // 싱글톤 인스턴스 생성
//        Configuration config = Configuration.getInstance();
//
//        // 설정 값 사용
//        System.out.println("Initial Configuration: " + config.getConfigValue());
//
//        // 다른 부분에서 설정 변경
//        config.setConfigValue("Updated Config");
//
//        // 변경된 설정 확인
//        Configuration anotherConfigReference = Configuration.getInstance();
//        System.out.println("Updated Configuration: " + anotherConfigReference.getConfigValue());
//    }
//}
//
