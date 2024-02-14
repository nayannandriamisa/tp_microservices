package fr.devavance;

import fr.devavance.beans.StationVelib;
import fr.devavance.repository.StationVelibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.stream.Stream;

@Component
public class InitDataRepository implements CommandLineRunner {
    @Autowired
    private StationVelibRepository stationVelibRepository;

    @Override
    public void run(String... strings) throws Exception {
        // A compléter : insérer les stations velibs décrites ci-dessous dans la base de données
        stationVelibRepository.save(new StationVelib("00901 - PORT SOLFÉRINO (STATION MOBILE)", "QUAI ANATOLE FRANCE - PONT SOLFERINO -", 0, "QUAI ANATOLE FRANCE - PONT SOLFERINO - 75007 PARIS", 48.86138, 2.32442, 901, 1));
        stationVelibRepository.save(new StationVelib("00903 - QUAI MAURIAC  / PONT DE BERCY", "FETE DE L'OH (BERCY) - QUAI MAURIAC ANG PONT DE BERCY -", 0, "FETE DE L'OH (BERCY) - QUAI MAURIAC ANG PONT DE BERCY - 75013 PARIS", 48.8371336894515, 2.37434055460561, 903, 1));
        stationVelibRepository.save(new StationVelib("00904 - PLACE JOFFRE / ECOLE MILITAIRE", "ECOLE MILITAIRE-AVENUE DE LA MOTTE PICQUET -", 0, "ECOLE MILITAIRE-AVENUE DE LA MOTTE PICQUET - 75007 PARIS",48.85213620522547, 2.301961227213259, 904, 1));
        stationVelibRepository.save(new StationVelib("00905 - CONCORDE/BERGES DE SEINE (STATION MOBILE)", "QUAI D'ORSAY - CONCORDE -", 0, "QUAI D'ORSAY - CONCORDE - 75007 PARIS", 48.86314, 2.31669, 905, 1));

        stationVelibRepository.findAll().forEach(stationVelib -> System.out.println(stationVelib));


    }
}