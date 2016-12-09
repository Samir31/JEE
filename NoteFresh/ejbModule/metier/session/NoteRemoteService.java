package metier.session;

import java.util.List;

import metier.entites.Collaborateur;
import metier.entites.Frais;
import metier.entites.Note;

public interface NoteRemoteService {

	
	public Collaborateur setCollaborateur(String nom, String prenom);
	public Note createNote();
	public Frais createFrais();
	public Note saveNote(Note note);
	public Note findNote(Long id);
	public List<Note> findNote();
	public boolean removeNote(Note note);
	 public String getVersion();
	
		
	
}
