package pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.service;

import pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.dto.FilmDetailDto;
import pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.dto.FilmDto;
import pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.dto.FilmRegisterDto;
import pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.dto.FilmUpdateDto;
import pe.edu.i201515503.CL2_SUCAPUCA_CUENCA_JHON.entity.Language;

import java.util.List;

public interface MaintenanceService {

    List<FilmDto> getAllFilms();

    FilmDetailDto getFilmById(int id);

    FilmUpdateDto getFilmUpdateById(int id);

    void updateFilm(FilmUpdateDto filmUpdateDto);

    void deleteFilm(int id);

    void registerNewFilm(FilmRegisterDto filmRegisterDto);

    List<Language> getAllLanguages();
}
