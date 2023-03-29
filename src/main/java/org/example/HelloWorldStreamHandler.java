package org.example;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.SkillStreamHandler;

import org.example.CancelandStopIntentHandler;
import org.example.HelloWorldIntentHandler;
import org.example.HelpIntentHandler;
import org.example.SessionEndedRequestHandler;
import org.example.LaunchRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}