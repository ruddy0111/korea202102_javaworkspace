package app0517.editor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{
	MemoEditor editor;
	public ActionHandler(MemoEditor editor) {
		this.editor = editor;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		editor.area.append("안녕");
	}

}
