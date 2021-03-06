package ru.kpfu.itis.uxcapture.services.interf;

import ru.kpfu.itis.uxcapture.models.Device;

/**
 * Created by Nurislam on 24.04.2018.
 */
public interface DeviceService {
    Long save(Device device);
    Device findById(Long id);
    Device findByUUID(String uuid);
}
