package net.datafaker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeagueOfLegendsTest extends AbstractFakerTest {

    @Test
    public void champion() {
        assertThat(faker.leagueOfLegends().champion()).matches("^(\\w+\\.?-?'?\\s?&?\\s?)+$");
    }

    @Test
    public void location() {
        assertThat(faker.leagueOfLegends().location()).matches("^(\\w+\\s?)+$");
    }

    @Test
    public void quote() {
        assertThat(faker.leagueOfLegends().quote()).isNotEmpty();
    }

    @Test
    public void summonerSpell() {
        assertThat(faker.leagueOfLegends().summonerSpell()).matches("^(\\w+\\s?!?)+$");
    }

    @Test
    public void masteries() {
        assertThat(faker.leagueOfLegends().masteries()).matches("^(\\w+\\s?'?)+$");
    }

    @Test
    public void rank() {
        assertThat(faker.leagueOfLegends().rank()).matches("^\\w+(\\s[IV]+)?$");
    }
}
