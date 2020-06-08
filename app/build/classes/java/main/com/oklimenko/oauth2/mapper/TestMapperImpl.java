package com.oklimenko.oauth2.mapper;

import com.oklimenko.oauth2.dto.TestDto;
import com.oklimenko.oauth2.entity.Test;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-23T19:10:38+0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
@Component
public class TestMapperImpl implements TestMapper {

    @Override
    public Test createDtoToEntity(TestDto request) {
        if ( request == null ) {
            return null;
        }

        Test test = new Test();

        test.setId( request.getId() );
        test.setName( request.getName() );
        test.setTimestamp( request.getTimestamp() );

        return test;
    }

    @Override
    public List<TestDto> createDtoToEntity(List<Test> request) {
        if ( request == null ) {
            return null;
        }

        List<TestDto> list = new ArrayList<TestDto>( request.size() );
        for ( Test test : request ) {
            list.add( testToTestDto( test ) );
        }

        return list;
    }

    protected TestDto testToTestDto(Test test) {
        if ( test == null ) {
            return null;
        }

        TestDto testDto = new TestDto();

        testDto.setId( test.getId() );
        testDto.setName( test.getName() );
        testDto.setTimestamp( test.getTimestamp() );

        return testDto;
    }
}
