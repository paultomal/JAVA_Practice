public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address);
        String  html = httpRequest(ip);
        System.out.println(html);
    }

    private String httpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress(String address) {
        return "172.0.0.0.1";
    }
}
