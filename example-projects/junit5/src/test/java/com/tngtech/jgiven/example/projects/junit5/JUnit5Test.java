package com.tngtech.jgiven.example.projects.junit5;

import com.tngtech.jgiven.annotation.JGivenConfiguration;
import com.tngtech.jgiven.annotation.ScenarioStage;
import com.tngtech.jgiven.junit5.JGivenExtension;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith( JGivenExtension.class )
@JGivenConfiguration( JGivenTestConfiguration.class )
public class JUnit5Test {

    @ScenarioStage
    GivenStage givenStage;

    @ScenarioStage
    WhenStage whenStage;

    @ScenarioStage
    ThenStage thenStage;

    @Test
    @Tag("JUnit5_Tag")
    public void scenario_with_JUnit5() {
        givenStage.given().message( "Hello JUnit" );
        whenStage.when().handle_message();
        thenStage.then().the_result_is( "Hello JUnit 5!" );
    }
}
