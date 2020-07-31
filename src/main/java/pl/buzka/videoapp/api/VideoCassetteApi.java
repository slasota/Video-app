package pl.buzka.videoapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.buzka.videoapp.dao.entity.VideoCassette;
import pl.buzka.videoapp.manager.VideoCassetteManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassettes")
public class VideoCassetteApi {

    private VideoCassetteManager videoCassettes;

    public VideoCassetteApi(VideoCassetteManager videoCassettes) {
        this.videoCassettes = videoCassettes;
    }

    @GetMapping("/all")
    public Iterable<VideoCassette> getAll(){
        return videoCassettes.findAll();
    }
    @GetMapping()
    public Optional<VideoCassette> getById(@RequestParam Long index){

        return videoCassettes.findById(index);
    }
    @PostMapping()
    public VideoCassette addVideo(@RequestBody VideoCassette videoCassette){
        return videoCassettes.save(videoCassette);
    }
    @PutMapping()
    public VideoCassette updateVideo(@RequestBody VideoCassette videoCassette){
        return videoCassettes.save(videoCassette);
    }

    @DeleteMapping()
    public void deleteVideo(@RequestParam Long index){
        videoCassettes.deleteById(index);
    }


}
