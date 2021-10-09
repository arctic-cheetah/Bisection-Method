/*
 * @(#)JSSP.java
 */
package examples;

import jp.ac.kobe_u.cs.cream.*;

/**
 * Job-shop scheduling benchmark problems.
 *
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 */
public class JSSP {
  static int numberOfJobs;
  static int numberOfMachines;
  static int[][] job_machine;
  static int[][] job_pt;

  static void ft06() {
    // 55
    numberOfJobs = 6;
    numberOfMachines = 6;
    int[][] _job_machine = {
      {2, 0, 1, 3, 5, 4},
      {1, 2, 4, 5, 0, 3},
      {2, 3, 5, 0, 1, 4},
      {1, 0, 2, 3, 4, 5},
      {2, 1, 4, 5, 0, 3},
      {1, 3, 5, 0, 4, 2}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {1, 3, 6, 7, 3, 6},
      {8, 5, 10, 10, 10, 4},
      {5, 4, 8, 9, 1, 7},
      {5, 5, 5, 3, 8, 9},
      {9, 3, 5, 4, 3, 1},
      {3, 3, 9, 10, 4, 1}
    };
    job_pt = _job_pt;
  }

  static void ft10() {
    // 930
    numberOfJobs = 10;
    numberOfMachines = 10;
    int[][] _job_machine = {
      {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
      {0, 2, 4, 9, 3, 1, 6, 5, 7, 8},
      {1, 0, 3, 2, 8, 5, 7, 6, 9, 4},
      {1, 2, 0, 4, 6, 8, 7, 3, 9, 5},
      {2, 0, 1, 5, 3, 4, 8, 7, 9, 6},
      {2, 1, 5, 3, 8, 9, 0, 6, 4, 7},
      {1, 0, 3, 2, 6, 5, 9, 8, 7, 4},
      {2, 0, 1, 5, 4, 6, 8, 9, 7, 3},
      {0, 1, 3, 5, 2, 9, 6, 7, 4, 8},
      {1, 0, 2, 6, 8, 9, 5, 3, 4, 7}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {29, 78, 9, 36, 49, 11, 62, 56, 44, 21},
      {43, 90, 75, 11, 69, 28, 46, 46, 72, 30},
      {91, 85, 39, 74, 90, 10, 12, 89, 45, 33},
      {81, 95, 71, 99, 9, 52, 85, 98, 22, 43},
      {14, 6, 22, 61, 26, 69, 21, 49, 72, 53},
      {84, 2, 52, 95, 48, 72, 47, 65, 6, 25},
      {46, 37, 61, 13, 32, 21, 32, 89, 30, 55},
      {31, 86, 46, 74, 32, 88, 19, 48, 36, 79},
      {76, 69, 76, 51, 85, 11, 40, 89, 26, 74},
      {85, 13, 61, 7, 64, 76, 47, 52, 90, 45}
    };
    job_pt = _job_pt;
  }

  static void la40() {
    // 1222
    numberOfJobs = 15;
    numberOfMachines = 15;
    int[][] _job_machine = {
      {9, 10, 4, 12, 2, 14, 5, 8, 6, 3, 1, 7, 13, 11, 0},
      {0, 1, 11, 2, 4, 9, 14, 8, 13, 12, 6, 3, 10, 5, 7},
      {14, 3, 1, 12, 6, 5, 8, 11, 7, 10, 2, 13, 0, 9, 4},
      {1, 6, 7, 4, 14, 10, 9, 5, 11, 2, 13, 8, 3, 12, 0},
      {12, 5, 9, 4, 14, 13, 0, 8, 11, 1, 2, 7, 6, 10, 3},
      {1, 5, 2, 13, 4, 14, 6, 7, 9, 10, 11, 0, 3, 12, 8},
      {9, 7, 6, 14, 3, 13, 2, 4, 12, 8, 1, 10, 0, 5, 11},
      {3, 7, 4, 8, 5, 2, 14, 12, 11, 0, 13, 10, 1, 6, 9},
      {3, 8, 6, 9, 14, 1, 5, 4, 13, 7, 11, 12, 10, 2, 0},
      {0, 5, 7, 4, 10, 12, 1, 13, 6, 8, 11, 9, 2, 14, 3},
      {2, 0, 6, 4, 3, 5, 12, 9, 14, 13, 8, 7, 11, 10, 1},
      {10, 14, 4, 9, 3, 1, 12, 13, 6, 8, 11, 7, 5, 2, 0},
      {0, 13, 3, 6, 1, 14, 11, 4, 10, 9, 5, 8, 7, 2, 12},
      {10, 12, 13, 4, 1, 3, 8, 5, 9, 0, 6, 7, 2, 14, 11},
      {1, 10, 6, 12, 4, 8, 3, 7, 13, 11, 5, 9, 2, 14, 0}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {65, 28, 74, 33, 51, 75, 73, 32, 13, 81, 35, 59, 38, 55, 27},
      {64, 53, 83, 33, 6, 52, 72, 7, 90, 21, 23, 10, 39, 49, 72},
      {73, 82, 23, 62, 88, 21, 65, 70, 53, 81, 93, 77, 61, 28, 78},
      {12, 51, 33, 15, 72, 98, 94, 12, 42, 24, 15, 28, 6, 99, 41},
      {97, 7, 96, 15, 73, 43, 32, 22, 42, 94, 23, 86, 78, 24, 31},
      {72, 88, 93, 13, 44, 66, 63, 14, 67, 17, 85, 35, 68, 5, 49},
      {15, 82, 21, 53, 72, 49, 99, 26, 56, 45, 68, 51, 8, 27, 96},
      {54, 24, 14, 38, 36, 52, 55, 37, 48, 93, 60, 70, 23, 23, 83},
      {12, 69, 26, 23, 28, 82, 33, 45, 64, 15, 9, 73, 59, 37, 62},
      {87, 12, 80, 50, 48, 90, 72, 24, 14, 71, 44, 46, 15, 61, 92},
      {54, 22, 61, 46, 73, 16, 6, 94, 93, 67, 54, 75, 32, 40, 97},
      {92, 36, 22, 9, 47, 77, 79, 36, 30, 98, 79, 7, 55, 6, 30},
      {49, 83, 73, 82, 82, 92, 73, 31, 35, 54, 7, 37, 72, 52, 76},
      {98, 34, 52, 26, 28, 39, 80, 29, 70, 43, 48, 58, 45, 94, 96},
      {70, 17, 90, 67, 14, 23, 21, 18, 43, 84, 26, 36, 93, 84, 42}
    };
    job_pt = _job_pt;
  }

  static void swv20() {
    // Unknown
    numberOfJobs = 50;
    numberOfMachines = 10;
    int[][] _job_machine = {
      {8, 7, 4, 9, 2, 1, 5, 0, 3, 6},
      {4, 6, 3, 7, 8, 0, 9, 2, 1, 5},
      {5, 0, 1, 7, 2, 8, 3, 4, 9, 6},
      {4, 6, 0, 2, 7, 1, 9, 3, 8, 5},
      {0, 1, 4, 8, 3, 5, 9, 7, 2, 6},
      {6, 7, 1, 0, 2, 9, 5, 4, 8, 3},
      {1, 4, 5, 9, 7, 2, 6, 8, 0, 3},
      {2, 3, 1, 7, 6, 4, 8, 5, 0, 9},
      {1, 6, 0, 3, 2, 9, 8, 4, 7, 5},
      {6, 3, 8, 0, 4, 1, 5, 7, 9, 2},
      {9, 5, 6, 3, 0, 7, 4, 1, 2, 8},
      {7, 0, 9, 2, 5, 6, 1, 3, 8, 4},
      {5, 8, 9, 4, 7, 0, 6, 2, 1, 3},
      {1, 5, 0, 7, 6, 3, 4, 9, 8, 2},
      {0, 8, 3, 6, 9, 4, 2, 1, 7, 5},
      {8, 1, 9, 7, 4, 5, 6, 3, 2, 0},
      {8, 6, 4, 7, 1, 3, 0, 9, 5, 2},
      {4, 2, 6, 1, 3, 0, 8, 9, 5, 7},
      {8, 5, 1, 3, 0, 4, 2, 7, 6, 9},
      {2, 9, 0, 1, 5, 8, 7, 3, 4, 6},
      {7, 4, 2, 3, 0, 9, 5, 8, 6, 1},
      {6, 8, 4, 7, 1, 2, 0, 3, 5, 9},
      {5, 0, 2, 6, 4, 1, 8, 7, 3, 9},
      {5, 6, 3, 8, 0, 2, 9, 1, 4, 7},
      {3, 2, 5, 8, 7, 6, 1, 0, 4, 9},
      {0, 9, 4, 6, 2, 7, 1, 3, 8, 5},
      {4, 1, 0, 7, 9, 2, 5, 6, 3, 8},
      {3, 5, 2, 7, 8, 0, 4, 6, 1, 9},
      {0, 7, 6, 2, 8, 4, 5, 3, 9, 1},
      {0, 3, 2, 4, 6, 1, 9, 7, 5, 8},
      {1, 0, 4, 8, 6, 5, 7, 2, 3, 9},
      {1, 9, 3, 0, 2, 5, 6, 4, 8, 7},
      {3, 4, 1, 7, 6, 5, 9, 0, 2, 8},
      {4, 3, 7, 0, 6, 9, 5, 8, 1, 2},
      {3, 8, 9, 2, 5, 4, 7, 0, 6, 1},
      {2, 4, 5, 0, 8, 9, 1, 7, 3, 6},
      {9, 6, 5, 3, 2, 0, 1, 7, 4, 8},
      {1, 3, 2, 5, 4, 7, 0, 9, 6, 8},
      {3, 8, 6, 9, 5, 7, 4, 2, 0, 1},
      {0, 8, 9, 5, 3, 7, 2, 1, 4, 6},
      {8, 5, 0, 1, 9, 7, 3, 4, 6, 2},
      {2, 1, 6, 0, 9, 8, 5, 7, 3, 4},
      {1, 7, 3, 6, 8, 9, 0, 2, 5, 4},
      {2, 1, 4, 9, 5, 0, 3, 6, 8, 7},
      {3, 7, 2, 9, 1, 5, 6, 4, 0, 8},
      {2, 7, 6, 1, 0, 8, 5, 4, 9, 3},
      {1, 4, 8, 9, 5, 0, 3, 6, 7, 2},
      {5, 4, 7, 8, 9, 2, 6, 0, 1, 3},
      {1, 7, 4, 8, 0, 2, 3, 6, 9, 5},
      {4, 6, 7, 5, 2, 8, 0, 3, 9, 1}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {100, 30, 42, 11, 31, 71, 41, 1, 55, 94},
      {81, 20, 96, 39, 29, 90, 61, 64, 86, 47},
      {80, 56, 88, 19, 68, 95, 44, 22, 60, 80},
      {86, 70, 88, 15, 50, 54, 88, 25, 89, 33},
      {48, 57, 86, 60, 78, 4, 60, 40, 11, 25},
      {23, 9, 90, 51, 52, 14, 30, 1, 25, 83},
      {30, 75, 76, 100, 54, 41, 50, 75, 1, 28},
      {46, 78, 37, 12, 56, 50, 66, 39, 8, 72},
      {24, 90, 32, 6, 99, 22, 12, 63, 81, 52},
      {62, 9, 59, 66, 41, 32, 29, 79, 84, 4},
      {57, 99, 2, 17, 51, 10, 14, 64, 99, 27},
      {81, 67, 83, 30, 25, 87, 29, 7, 93, 1},
      {65, 53, 48, 28, 74, 60, 77, 22, 5, 98},
      {97, 37, 71, 49, 51, 17, 38, 67, 28, 31},
      {20, 94, 39, 73, 63, 8, 57, 27, 26, 42},
      {77, 68, 20, 100, 1, 77, 17, 35, 65, 86},
      {68, 62, 79, 84, 60, 56, 10, 86, 60, 30},
      {71, 74, 6, 56, 69, 8, 50, 78, 4, 89},
      {29, 5, 59, 96, 46, 91, 48, 53, 21, 82},
      {19, 96, 73, 39, 54, 50, 60, 50, 65, 78},
      {68, 15, 26, 26, 13, 13, 96, 70, 27, 93},
      {41, 18, 66, 9, 31, 92, 3, 78, 41, 53},
      {9, 64, 15, 73, 12, 43, 89, 69, 32, 22},
      {93, 19, 74, 81, 72, 94, 19, 26, 53, 7},
      {48, 29, 51, 72, 35, 32, 38, 98, 58, 54},
      {94, 23, 41, 53, 53, 27, 62, 68, 84, 49},
      {4, 4, 66, 90, 78, 29, 2, 86, 23, 46},
      {78, 61, 97, 68, 92, 15, 12, 77, 12, 22},
      {100, 89, 71, 70, 89, 72, 78, 23, 37, 2},
      {91, 74, 36, 72, 62, 80, 20, 77, 47, 80},
      {44, 67, 66, 99, 59, 5, 15, 38, 40, 19},
      {69, 35, 86, 7, 35, 32, 66, 89, 63, 52},
      {3, 68, 66, 27, 41, 2, 77, 45, 40, 39},
      {66, 42, 79, 55, 98, 44, 6, 73, 55, 1},
      {80, 18, 94, 27, 42, 17, 74, 65, 6, 27},
      {73, 70, 51, 84, 29, 95, 97, 28, 68, 89},
      {85, 56, 54, 76, 50, 43, 8, 93, 17, 65},
      {1, 17, 61, 38, 71, 18, 40, 94, 41, 74},
      {30, 22, 39, 56, 3, 64, 74, 21, 93, 1},
      {17, 8, 20, 38, 85, 5, 63, 18, 89, 88},
      {87, 44, 42, 34, 11, 13, 71, 88, 32, 12},
      {39, 73, 43, 48, 77, 48, 23, 66, 94, 68},
      {98, 19, 69, 5, 85, 19, 30, 43, 87, 70},
      {45, 60, 30, 71, 35, 75, 75, 41, 67, 37},
      {63, 39, 16, 69, 46, 20, 57, 51, 66, 40},
      {7, 73, 17, 21, 24, 2, 68, 22, 36, 60},
      {20, 17, 12, 29, 28, 7, 38, 57, 22, 75},
      {53, 7, 5, 27, 38, 100, 48, 53, 11, 18},
      {49, 47, 81, 9, 20, 63, 15, 1, 10, 5},
      {49, 27, 17, 64, 30, 56, 42, 97, 82, 34}
    };
    job_pt = _job_pt;
  }

  static void abz08() {
    // 656
    numberOfJobs = 20;
    numberOfMachines = 15;
    int[][] _job_machine = {
      {6, 5, 8, 4, 1, 14, 13, 11, 10, 12, 2, 3, 0, 7, 9},
      {1, 5, 0, 3, 6, 9, 7, 12, 10, 13, 8, 4, 11, 14, 2},
      {0, 4, 2, 10, 6, 14, 8, 13, 7, 3, 9, 12, 1, 11, 5},
      {7, 5, 4, 8, 0, 9, 13, 12, 10, 3, 6, 14, 1, 11, 2},
      {2, 3, 12, 11, 6, 4, 10, 7, 0, 13, 1, 14, 5, 9, 8},
      {5, 3, 6, 12, 10, 0, 13, 2, 11, 7, 4, 1, 14, 9, 8},
      {13, 0, 11, 12, 4, 6, 5, 3, 9, 2, 7, 10, 1, 14, 8},
      {2, 12, 9, 11, 13, 8, 14, 5, 6, 3, 1, 4, 0, 7, 10},
      {2, 10, 14, 6, 8, 3, 12, 0, 13, 9, 7, 1, 11, 4, 5},
      {4, 9, 3, 11, 13, 7, 0, 2, 5, 12, 1, 10, 14, 8, 6},
      {13, 0, 3, 8, 5, 6, 14, 7, 1, 2, 4, 9, 12, 11, 10},
      {14, 10, 0, 3, 13, 6, 7, 2, 12, 5, 4, 11, 1, 8, 9},
      {6, 12, 4, 2, 8, 5, 14, 3, 9, 1, 11, 13, 7, 10, 0},
      {5, 14, 0, 8, 7, 4, 9, 13, 1, 12, 6, 11, 3, 10, 2},
      {5, 3, 10, 6, 4, 12, 11, 13, 7, 9, 14, 1, 2, 0, 8},
      {8, 5, 9, 6, 1, 7, 11, 2, 4, 0, 10, 3, 12, 14, 13},
      {1, 4, 8, 3, 10, 5, 12, 7, 9, 14, 11, 13, 0, 2, 6},
      {7, 5, 13, 9, 10, 4, 14, 0, 3, 11, 6, 8, 1, 2, 12},
      {14, 11, 5, 2, 13, 10, 4, 8, 3, 9, 6, 7, 0, 1, 12},
      {1, 7, 11, 8, 14, 6, 5, 3, 13, 2, 0, 4, 9, 12, 10}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {14, 21, 13, 11, 11, 35, 20, 17, 18, 11, 23, 13, 15, 11, 35},
      {35, 31, 13, 26, 14, 17, 38, 20, 19, 12, 16, 34, 15, 12, 14},
      {30, 35, 40, 35, 30, 23, 29, 37, 38, 40, 26, 11, 40, 36, 17},
      {40, 18, 12, 23, 23, 14, 16, 14, 23, 12, 16, 32, 40, 25, 29},
      {35, 15, 31, 28, 32, 30, 27, 29, 38, 11, 23, 17, 27, 37, 29},
      {33, 33, 19, 40, 19, 33, 26, 31, 28, 36, 38, 21, 25, 40, 35},
      {25, 32, 33, 18, 32, 28, 15, 35, 14, 34, 23, 32, 17, 26, 19},
      {16, 33, 34, 30, 40, 12, 26, 26, 15, 21, 40, 32, 14, 30, 35},
      {17, 16, 20, 24, 26, 36, 22, 14, 11, 20, 23, 29, 23, 15, 40},
      {27, 37, 40, 14, 25, 30, 34, 11, 15, 32, 36, 12, 28, 31, 23},
      {25, 22, 27, 14, 25, 20, 18, 14, 19, 17, 27, 22, 22, 27, 21},
      {34, 15, 22, 29, 34, 40, 17, 32, 20, 39, 31, 16, 37, 33, 13},
      {12, 27, 17, 24, 11, 19, 11, 17, 25, 11, 31, 33, 31, 12, 22},
      {22, 15, 16, 32, 20, 22, 11, 19, 30, 33, 29, 18, 34, 32, 18},
      {27, 26, 28, 37, 18, 12, 11, 26, 27, 40, 19, 24, 18, 12, 34},
      {15, 28, 25, 32, 13, 38, 11, 34, 25, 20, 32, 23, 14, 16, 20},
      {15, 13, 37, 14, 22, 24, 26, 22, 34, 22, 19, 32, 29, 13, 35},
      {36, 33, 28, 20, 30, 33, 29, 34, 22, 12, 30, 12, 35, 13, 35},
      {26, 31, 35, 38, 19, 35, 27, 29, 39, 13, 14, 26, 17, 22, 15},
      {36, 34, 33, 17, 38, 39, 16, 27, 29, 16, 16, 19, 40, 35, 39}
    };
    job_pt = _job_pt;
  }

  static void ta44() {
    numberOfJobs = 30;
    numberOfMachines = 20;
    int[][] _job_machine = {
      {5, 0, 6, 16, 2, 15, 19, 10, 12, 13, 4, 3, 9, 17, 18, 1, 7, 8, 14, 11},
      {17, 11, 16, 13, 1, 7, 4, 14, 10, 8, 2, 19, 3, 12, 6, 5, 0, 15, 9, 18},
      {15, 9, 18, 19, 1, 16, 17, 8, 0, 14, 13, 2, 7, 3, 12, 11, 5, 6, 10, 4},
      {13, 1, 19, 2, 10, 6, 8, 3, 0, 16, 9, 5, 14, 17, 15, 11, 12, 4, 18, 7},
      {13, 3, 2, 19, 1, 0, 15, 6, 18, 14, 5, 16, 17, 9, 11, 10, 12, 7, 4, 8},
      {6, 17, 14, 19, 7, 12, 3, 18, 5, 11, 8, 0, 1, 15, 16, 10, 13, 4, 2, 9},
      {0, 10, 15, 11, 17, 14, 5, 6, 8, 3, 9, 16, 12, 2, 1, 19, 18, 13, 7, 4},
      {9, 10, 8, 13, 16, 18, 15, 3, 6, 5, 1, 11, 14, 0, 7, 17, 2, 12, 4, 19},
      {4, 6, 19, 5, 2, 9, 16, 18, 7, 8, 12, 1, 15, 13, 17, 10, 0, 14, 3, 11},
      {17, 1, 12, 5, 2, 3, 8, 7, 6, 9, 19, 15, 14, 10, 4, 18, 11, 16, 13, 0},
      {17, 15, 11, 0, 7, 6, 5, 9, 4, 12, 10, 2, 14, 16, 19, 3, 13, 8, 1, 18},
      {13, 14, 2, 5, 0, 11, 16, 17, 15, 9, 18, 6, 19, 7, 12, 3, 4, 1, 10, 8},
      {3, 5, 13, 0, 14, 12, 11, 16, 2, 19, 8, 9, 15, 4, 7, 17, 6, 18, 10, 1},
      {15, 5, 18, 17, 6, 16, 13, 12, 3, 2, 9, 0, 1, 14, 8, 10, 11, 19, 4, 7},
      {10, 6, 19, 15, 4, 17, 8, 1, 12, 18, 0, 9, 3, 5, 13, 11, 2, 16, 7, 14},
      {3, 9, 16, 6, 7, 11, 14, 8, 18, 12, 5, 17, 19, 10, 2, 1, 0, 15, 13, 4},
      {13, 18, 5, 6, 8, 0, 4, 10, 7, 12, 1, 15, 3, 16, 19, 2, 11, 17, 9, 14},
      {5, 15, 1, 2, 19, 18, 12, 13, 16, 17, 14, 9, 0, 11, 10, 3, 8, 4, 6, 7},
      {8, 14, 6, 3, 11, 4, 12, 15, 1, 0, 17, 7, 5, 10, 19, 2, 18, 13, 16, 9},
      {10, 0, 14, 2, 16, 19, 17, 6, 3, 8, 12, 11, 7, 13, 15, 9, 1, 5, 4, 18},
      {17, 14, 1, 4, 7, 16, 0, 18, 19, 13, 15, 8, 2, 11, 10, 6, 3, 12, 9, 5},
      {14, 16, 17, 5, 4, 8, 10, 12, 3, 19, 2, 9, 18, 13, 15, 0, 7, 1, 6, 11},
      {1, 14, 2, 8, 13, 6, 12, 3, 5, 18, 17, 11, 10, 0, 7, 19, 15, 4, 16, 9},
      {7, 11, 3, 9, 8, 4, 18, 5, 14, 0, 10, 13, 1, 2, 15, 17, 19, 6, 12, 16},
      {19, 6, 9, 16, 17, 8, 14, 11, 7, 10, 18, 2, 3, 0, 1, 12, 4, 5, 15, 13},
      {2, 16, 17, 6, 3, 4, 11, 5, 18, 14, 15, 19, 0, 9, 7, 12, 13, 10, 1, 8},
      {13, 11, 16, 14, 6, 15, 1, 17, 0, 12, 5, 3, 2, 4, 7, 8, 10, 9, 18, 19},
      {10, 2, 6, 0, 19, 14, 7, 12, 18, 16, 5, 9, 15, 3, 11, 13, 1, 17, 4, 8},
      {15, 19, 11, 17, 18, 13, 4, 6, 8, 12, 3, 14, 1, 10, 16, 2, 5, 0, 7, 9},
      {0, 18, 19, 6, 11, 4, 5, 13, 2, 12, 17, 3, 1, 16, 8, 10, 9, 7, 14, 15}
    };
    job_machine = _job_machine;
    int[][] _job_pt = {
      {51, 93, 49, 1, 52, 26, 74, 59, 44, 8, 81, 95, 68, 57, 57, 40, 17, 92, 88, 6},
      {75, 22, 11, 49, 31, 32, 5, 51, 14, 43, 43, 24, 83, 67, 2, 45, 75, 35, 50, 95},
      {80, 13, 36, 51, 63, 58, 30, 75, 72, 92, 13, 13, 92, 12, 76, 29, 64, 58, 26, 21},
      {91, 95, 51, 75, 89, 56, 74, 60, 86, 70, 97, 11, 61, 68, 43, 5, 17, 18, 14, 93},
      {40, 9, 80, 82, 67, 33, 84, 39, 48, 89, 95, 60, 4, 99, 92, 52, 79, 9, 89, 54},
      {55, 70, 95, 60, 9, 82, 52, 30, 6, 27, 57, 89, 63, 29, 55, 37, 66, 16, 87, 63},
      {44, 47, 90, 35, 79, 57, 58, 98, 62, 8, 31, 94, 49, 90, 11, 63, 22, 44, 96, 86},
      {63, 80, 72, 83, 25, 55, 68, 42, 70, 64, 24, 7, 45, 12, 17, 8, 41, 88, 7, 83},
      {68, 99, 37, 33, 72, 98, 92, 28, 14, 16, 99, 9, 93, 25, 8, 64, 4, 74, 35, 37},
      {79, 34, 36, 83, 48, 23, 2, 5, 16, 76, 10, 95, 12, 94, 46, 53, 35, 73, 78, 55},
      {31, 75, 11, 92, 46, 84, 39, 17, 83, 87, 86, 93, 68, 67, 83, 4, 96, 3, 7, 51},
      {4, 50, 20, 74, 37, 95, 65, 83, 98, 25, 64, 90, 51, 61, 97, 70, 14, 13, 99, 83},
      {41, 81, 93, 78, 53, 66, 40, 8, 63, 66, 2, 36, 24, 61, 75, 27, 71, 23, 18, 60},
      {87, 29, 36, 2, 18, 2, 11, 47, 94, 92, 58, 93, 47, 90, 28, 54, 28, 84, 68, 4},
      {23, 74, 95, 64, 21, 46, 86, 8, 58, 64, 99, 29, 47, 64, 6, 25, 63, 59, 96, 19},
      {75, 75, 76, 83, 22, 98, 85, 75, 11, 64, 21, 94, 46, 63, 78, 35, 9, 16, 39, 28},
      {57, 66, 46, 84, 16, 19, 1, 29, 65, 42, 87, 38, 88, 83, 86, 21, 38, 61, 29, 74},
      {66, 74, 43, 55, 86, 69, 11, 12, 61, 56, 56, 77, 80, 16, 13, 14, 14, 96, 88, 20},
      {52, 1, 82, 57, 18, 94, 44, 81, 25, 75, 29, 74, 10, 24, 63, 42, 62, 98, 67, 72},
      {81, 95, 46, 6, 5, 18, 79, 43, 28, 27, 84, 83, 99, 60, 86, 21, 13, 28, 91, 20},
      {63, 56, 24, 43, 30, 22, 31, 64, 56, 62, 25, 85, 13, 76, 63, 51, 87, 21, 65, 1},
      {54, 1, 71, 76, 23, 90, 19, 97, 84, 27, 70, 38, 62, 94, 47, 22, 52, 21, 11, 97},
      {91, 67, 12, 75, 42, 38, 63, 92, 41, 14, 28, 84, 39, 49, 23, 58, 9, 19, 17, 46},
      {89, 44, 61, 63, 95, 70, 49, 99, 44, 68, 86, 86, 11, 13, 17, 85, 62, 80, 37, 2},
      {39, 42, 19, 81, 46, 87, 7, 58, 27, 97, 53, 21, 69, 97, 64, 47, 11, 43, 67, 11},
      {4, 13, 44, 27, 23, 25, 44, 39, 38, 31, 38, 95, 13, 19, 29, 37, 44, 77, 24, 39},
      {56, 91, 37, 36, 86, 2, 39, 19, 90, 43, 72, 87, 37, 39, 90, 33, 73, 88, 34, 66},
      {56, 32, 48, 6, 9, 57, 21, 56, 37, 75, 40, 93, 97, 5, 67, 24, 20, 15, 16, 21},
      {31, 30, 88, 45, 37, 38, 3, 97, 40, 29, 24, 30, 29, 45, 51, 58, 82, 51, 85, 37},
      {38, 77, 8, 48, 46, 89, 96, 50, 21, 38, 57, 26, 97, 70, 23, 18, 33, 34, 35, 69}
    };
    job_pt = _job_pt;
  }

  static Network jssp(String problem) {
    if (problem.equals("ft06")) {
      ft06();
    } else if (problem.equals("ft10")) {
      ft10();
    } else if (problem.equals("la40")) {
      la40();
    } else if (problem.equals("swv20")) {
      swv20();
    } else if (problem.equals("abz08")) {
      abz08();
    } else if (problem.equals("ta44")) {
      ta44();
    } else {
      System.out.println("Unknown problem");
      return null;
    }
    int[][] machine_op = new int[numberOfMachines][numberOfJobs];
    int[][] machine_pt = new int[numberOfMachines][numberOfJobs];
    for (int j = 0; j < job_machine.length; j++) {
      for (int k = 0; k < job_machine[j].length; k++) {
        int m = job_machine[j][k];
        machine_op[m][j] = k;
        machine_pt[m][j] = job_pt[j][k];
      }
    }

    Network net = new Network();
    Variable makespan = new Variable(net, new IntDomain(0, IntDomain.MAX_VALUE));
    net.setObjective(makespan);
    Variable[][] job = new Variable[numberOfJobs][numberOfMachines + 1];
    for (int j = 0; j < numberOfJobs; j++) {
      for (int k = 0; k < numberOfMachines; k++) {
        job[j][k] = new Variable(net, new IntDomain(0, IntDomain.MAX_VALUE));
      }
      job[j][numberOfMachines] = makespan;
      new Sequential(net, job[j], job_pt[j]);
    }
    Variable[][] machine = new Variable[numberOfMachines][numberOfJobs];
    for (int m = 0; m < numberOfMachines; m++) {
      for (int j = 0; j < numberOfJobs; j++) {
        int k = machine_op[m][j];
        machine[m][j] = job[j][k];
      }
      new Serialized(net, machine[m], machine_pt[m]);
    }
    return net;
  }

  public static void main(String[] args) {
    String problem;
    //		problem = "ft06";
    problem = "ft10";
    //		problem = "la40";
    //		problem = "swv20";
    //		problem = "abz08";
    //		problem = "ta44";

    long timeout = 10 * 60 * 1000;
    String[] solverNames = {"sa", "ibb", "taboo"};
    int i = 0;
    if (i < args.length) problem = args[i++];
    if (i < args.length) timeout = Integer.parseInt(args[i++]) * 1000;
    if (i < args.length) {
      solverNames = new String[args.length - i];
      int j = 0;
      for (; i < args.length; i++) {
        solverNames[j++] = args[i];
      }
    }
    Network network = jssp(problem);
    if (network == null) return;
    int opt = Solver.MINIMIZE;
    Solver[] solvers = new Solver[solverNames.length];
    for (i = 0; i < solvers.length; i++) {
      String name = solverNames[i];
      if (name.equals("sa")) {
        solvers[i] = new SASearch((Network) network.clone(), opt, name);
      } else if (name.equals("ibb")) {
        solvers[i] = new IBBSearch((Network) network.clone(), opt, name);
      } else if (name.equals("taboo") || name.equals("tabu")) {
        solvers[i] = new TabooSearch((Network) network.clone(), opt, name);
      } else if (name.equals("rw")) {
        solvers[i] = new LocalSearch((Network) network.clone(), opt, name);
      } else {
        System.out.println("Unknown solver name " + name);
        solvers[i] = null;
      }
    }
    Solver solver = new ParallelSolver(solvers);
    //		Monitor monitor = new Monitor();
    //		// monitor.setX(0, (int)(timeout/1000));
    //		solver.setMonitor(monitor);
    Solution solution = solver.findBest(timeout);
    System.out.println("Best = " + solution.getObjectiveIntValue());
  }
}
