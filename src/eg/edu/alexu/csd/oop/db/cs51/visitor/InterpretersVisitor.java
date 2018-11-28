package eg.edu.alexu.csd.oop.db.cs51.visitor;

import java.sql.SQLException;

import eg.edu.alexu.csd.oop.db.cs51.interpreter.CreateDBInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.CreateTableInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.DeleteInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.DropDatabaseInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.DropTableInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.InsertInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.SelectInterpreter;
import eg.edu.alexu.csd.oop.db.cs51.interpreter.UpdateInterpreter;

public class InterpretersVisitor implements Visitor {


	@Override
	public Object visit(CreateTableInterpreter createTableInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(DeleteInterpreter deleteInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(DropDatabaseInterpreter databaseInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(DropTableInterpreter dropTableInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(InsertInterpreter insertInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(SelectInterpreter selectInterpreter, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(UpdateInterpreter updateInterprater, String query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
