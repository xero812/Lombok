package mapper;

import entity.EmployeeEntity;
import entry.EmployeeEntry;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-07-19T01:36:32+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_161 (Oracle Corporation)"
)
public class AutoMapperImpl implements AutoMapper {

    @Override
    public EmployeeEntity convertEntryToEntity(EmployeeEntry entry) {
        if ( entry == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setId( entry.getId() );
        employeeEntity.setName( entry.getName() );

        return employeeEntity;
    }

    @Override
    public EmployeeEntry convertEntityToEntry(EmployeeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        EmployeeEntry employeeEntry = new EmployeeEntry();

        employeeEntry.setId( entity.getId() );
        employeeEntry.setName( entity.getName() );

        return employeeEntry;
    }
}
