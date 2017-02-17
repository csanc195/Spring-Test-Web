package dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CarlosSanchez on 2/17/17.
 */
public class IP_Reccords {

    private List<String> ipAdresses;

    public IP_Reccords() {
        this.ipAdresses = new ArrayList<>();
    }

    public List<String> getIpAdresses() {
        return ipAdresses;
    }

    public void setIpAdresses(List<String> ipAdresses) {
        this.ipAdresses = ipAdresses;
    }

    private boolean searchIp(String iPtoFind){
        for(String ip: ipAdresses) {
            if (ip == iPtoFind) {
                return true;
            }
        }
        return false;
    }

    public boolean addIP(String ip){
        if(!searchIp(ip)){
            ipAdresses.add(ip);
            return true;
        }
        return false;
    }
}
