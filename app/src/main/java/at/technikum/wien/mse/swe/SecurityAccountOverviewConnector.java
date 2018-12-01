package at.technikum.wien.mse.swe;

import java.nio.file.Path;

import at.technikum.wien.mse.swe.model.SecurityAccountOverview;

public interface SecurityAccountOverviewConnector {

    SecurityAccountOverview read(Path file);

}
