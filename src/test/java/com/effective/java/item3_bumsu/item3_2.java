//public enum Configuration {
//    INSTANCE;
//
//    private String configValue;
//
//    // 초기화 블록
//    {
//        configValue = "Default Config";
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
//
//public class Application {
//    public static void main(String[] args) {
//        // 싱글톤 인스턴스 todtjd
//        Configuration config = Configuration.INSTANCE;
//
//        // 설정 값 사용
//        System.out.println("Initial Configuration: " + config.getConfigValue());
//
//        // 설정 변경
//        config.setConfigValue("Updated Config");
//
//        // 변경된 설정 확인
//        System.out.println("Updated Configuration: " + config.getConfigValue());
//    }
//}
