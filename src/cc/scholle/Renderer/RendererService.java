package cc.scholle.Renderer;
import org.fourthline.cling.model.meta.RemoteDevice;

import java.util.ArrayList;
import java.util.List;

/**
 * Handle Subscribed devices
 */
public class RendererService {
    List<RemoteDevice> devices = new ArrayList<RemoteDevice>();

    public void addDevice(RemoteDevice device){
        devices.add(device);

    }

    public void removeDevice(RemoteDevice device){
        devices.remove(device);
    }

}
