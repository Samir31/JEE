package metier.session;

import java.util.List;

import metier.entites.Collaborateur;
import metier.entites.Frais;
import metier.entites.Note;

public class NoteService implements NoteRemoteService {

	Collaborateur colla;
	@Override
	public Collaborateur setCollaborateur(String nom, String prenom) {
		return null;
	}

	@Override
	public Note createNote() {
		return new Note();
	}

	@Override
	public Frais createFrais() {
		return new Frais();
	}

	@Override
	public Note saveNote(Note note) {
		
		return note;
	}

	@Override
	public Note findNote(Long id) {
	
		return null;
	}

	@Override
	public List<Note> findNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeNote(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

}
