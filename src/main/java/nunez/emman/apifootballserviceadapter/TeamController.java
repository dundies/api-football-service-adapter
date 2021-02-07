package nunez.emman.apifootballserviceadapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Emman Nunez
 * @date 1/31/2021
 */
@RestController
@RequestMapping("/teams")
public class TeamController {

    @GetMapping("/{teamId}")
    public Mono<Team> getTeam(@PathVariable Long teamId) {
        return Mono.just(new Team("Real Madrid"));
    }

    @Data
    @AllArgsConstructor
    private class Team {
        private String name;
    }
}
