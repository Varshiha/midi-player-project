Project: midi-player
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

It is discussed in chapter 3.

41. I see the notes with the duration: Instrument number: 0
C (12) A (12) E (12) C (15) D (19). I am not a pianist but I am pretty sure you can play the tune on the piano because you have the notes and duration.

43. Yes you can

45. Internal: addNoteToTrack(noteValue, track, tick, duration);
External: tune.getNotes()

52. It gives the same version as the other one. 

55. I am really not sure what I did and I dont think I quite understand the debugger. When I did Step on the line that I was told, the notes were not shown. So I went a two lines lower I thought i would show the notes and duration and it did. However, I still don't fully grasp the meaning of the debugger. 

56. I think the line under it will be selected: this.instrument = instrument;. It did select that. I think it will keep selecting the line that is right after it.

57. When I did it to the end it played the tune. 

58. The green line goes to:
notes.add(new Note(noteName, duration));
{
this.noteName = noteName;
this.duration = duration;
}
notes.add(new Note(noteName, duration));
It went trhought this same order 3 times. When i was at the first addNote, it went to the second when after the first round and then the same again for when it reached the third one. After doint it more. it went into the note class.





