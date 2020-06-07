package com.nubes.cj.day24;

public class TaskManager implements Cloneable{
		private static TaskManager obj;

		private TaskManager() {
		}
		
		public static TaskManager getInstance() {
			if(obj==null) {
				obj = new TaskManager();
			}
			return obj;
		}
		
		@Override
		protected Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException("This object can't be cloned");
		}
		
		
}
