package ru.mobilcard.mcoffice.database.models.wrk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.mobilcard.mcoffice.database.models.interfaces.Model;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ScanTechRegModel implements Model {
    private Long id;
    private String name;
    private String numCode;
}
