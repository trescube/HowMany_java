package com.stupidplebs.howmany

import spock.lang.Specification

class HowManyWithStreamsSpec extends Specification {
    def "solve should return the correct result"() {
        given:
        def howMany = new HowManyWithStreams()
        
        when:
        def actual = howMany.solve()
        
        then:
        actual == [
            0: 1,
            1: 7,
            2: 3,
            3: 2,
            4: 1,
            5: 1,
            6: 1,
            7: 2,
            8: 1,
            9: 1
        ]
        
    }
}
